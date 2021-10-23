package de.metas.ddorder.movement.schedule.plan;

import com.google.common.collect.ImmutableList;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.eevolution.api.DDOrderId;

/**
 * A plan about what HUs and how much to move for a given Distribution Order.
 * <p>
 * These plans can be saved and they become move schedules.
 */
@Value
@Builder
public class DDOrderMovePlan
{
	@NonNull DDOrderId ddOrderId;
	@NonNull ImmutableList<DDOrderMovePlanStep> lines;
}
