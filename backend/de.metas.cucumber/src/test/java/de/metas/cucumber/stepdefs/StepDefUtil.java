/*
 * #%L
 * de.metas.cucumber
 * %%
 * Copyright (C) 2021 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

package de.metas.cucumber.stepdefs;

import lombok.NonNull;
import lombok.experimental.UtilityClass;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@UtilityClass
public class StepDefUtil
{
	public void tryAndWait(final long maxWaitSeconds, final long checkingIntervalMs, final Supplier<Boolean> worker, @Nullable final Runnable logContext) throws InterruptedException
	{
		final long nowMillis = System.currentTimeMillis(); // don't use SystemTime.millis(); because it's probably "rigged" for testing purposes,
		final long deadLineMillis = nowMillis + (maxWaitSeconds * 1000L);

		boolean conditionIsMet = worker.get();

		while (System.currentTimeMillis() < deadLineMillis && !conditionIsMet)
		{
			Thread.sleep(checkingIntervalMs);
			conditionIsMet = worker.get();
		}

		if (!conditionIsMet && logContext != null)
		{
			logContext.run();
		}

		assertThat(conditionIsMet).isTrue();
	}

	public void tryAndWait(final long maxWaitSeconds, final long checkingIntervalMs, final Supplier<Boolean> worker) throws InterruptedException
	{
		tryAndWait(maxWaitSeconds, checkingIntervalMs, worker, null);
	}

	@NonNull
	public List<String> splitIdentifiers(@NonNull final String identifiers)
	{
		return Arrays.asList(identifiers.split(","));
	}
}
