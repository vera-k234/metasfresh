// import { globalStore } from './index';
// import { networkStatusOffline, networkStatusOnline } from './actions/NetworkActions';

/* eslint-disable no-restricted-globals */

// This service worker can be customized!
// See https://developers.google.com/web/tools/workbox/modules
// for the list of available Workbox modules, or add any other
// code you'd like.
// You can also remove this file if you'd prefer not to use a
// service worker, and the Workbox build step will be skipped.

import { clientsClaim } from 'workbox-core';
import { ExpirationPlugin } from 'workbox-expiration';
import { precacheAndRoute, createHandlerBoundToURL } from 'workbox-precaching';
import { registerRoute } from 'workbox-routing';
import { StaleWhileRevalidate } from 'workbox-strategies';

clientsClaim();

// Precache all of the assets generated by your build process.
// Their URLs are injected into the manifest variable below.
// This variable must be present somewhere in your service worker file,
// even if you decide not to use precaching. See https://cra.link/PWA
precacheAndRoute(self.__WB_MANIFEST);

// Set up App Shell-style routing, so that all navigation requests
// are fulfilled with your index.html shell. Learn more at
// https://developers.google.com/web/fundamentals/architecture/app-shell
const fileExtensionRegexp = new RegExp('/[^/?]+\\.[^/]+$');
registerRoute(
  // Return false to exempt requests from being fulfilled by index.html.
  ({ request, url }) => {
    // If this isn't a navigation, skip.
    if (request.mode !== 'navigate') {
      return false;
    } // If this is a URL that starts with /_, skip.

    if (url.pathname.startsWith('/_')) {
      return false;
    } // If this looks like a URL for a resource, because it contains // a file extension, skip.

    if (url.pathname.match(fileExtensionRegexp)) {
      return false;
    } // Return true to signal that we want to use the handler.

    return true;
  },
  // createHandlerBoundToURL(process.env.PUBLIC_URL + '/index.html')
  createHandlerBoundToURL('./index.html')
);

// An example runtime caching route for requests that aren't handled by the
// precache, in this case same-origin .png requests like those from in public/
registerRoute(
  // Add in any other file extensions or routing criteria as needed.
  ({ url }) => url.origin === self.location.origin && url.pathname.endsWith('.png'), // Customize this strategy as needed, e.g., by changing to CacheFirst.
  new StaleWhileRevalidate({
    cacheName: 'images',
    plugins: [
      // Ensure that once this runtime cache reaches a maximum size the
      // least-recently used images are removed.
      new ExpirationPlugin({ maxEntries: 50 }),
    ],
  })
);

self.addEventListener('install', function () {
  // Force refreshing the sw on install
  if (self.skipWaiting) {
    self.skipWaiting();
  }
});

// This allows the web app to trigger skipWaiting via
// registration.waiting.postMessage({type: 'SKIP_WAITING'})
self.addEventListener('message', (event) => {
  if (event.data && event.data.type === 'SKIP_WAITING') {
    self.skipWaiting();
  }
});

const cacheVersion = '0.0.1';

// const broadcast = new BroadcastChannel('network-status-channel');

// Any other custom service worker logic can go here.
self.addEventListener('fetch', (event) => {
  if (event.request.url.endsWith('config.js')) {
    //event.respondWith(new Response('// no-op'));
    event.respondWith(fetch(event.request));
  } else {
    //  Sending a request to the network and the cache. The cache will most likely respond first and,
    //  if the network data has not already been received, we update the page with the data in the response.
    //  When the network responds we update the page again with the latest information.
    self.addEventListener('fetch', function (event) {
      if (event.request.url.startsWith('http')) {
        event.respondWith(
          caches.open(cacheVersion).then(function (cache) {
            return fetch(event.request).then(function (response) {
              cache.put(event.request, response.clone());
              return response;
            });
          })
        );
      }
    });

    // Prevent the default, and handle the request ourselves.
    /*
    event.respondWith(
      (async function () {
        // Try to get the response from a cache.
        const cachedResponse = await caches.match(event.request);
        // Return it if we found one.
        if (cachedResponse) {
          console.log('[ServiceWorker] -> Retrieving from cache...');
          return cachedResponse;
        }
        // If we didn't find a match in the cache, use the network.
        return fetch(event.request).catch(function () {
          console.log('OFFLINE - You appear to be offline now');
          broadcast.postMessage({ payload: 'offline' });
        });
      })()
    );
    */
  }
});

// Uncomment this when quick deploy needed
// self.addEventListener('activate', (event) => {
//   // delete caches - !!! To be used only for quick deploys
//   event.waitUntil(clients.claim());
// })
