package myJava.java8.dateTimeAPI;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.zone.ZoneOffsetTransition;
import java.time.zone.ZoneRules;
import java.util.List;
import java.util.Set;

public class Zoned {
	public static void main(String[] args) {
		ZoneOffset zoneOffset1 = ZoneOffset.ofHours(-1);
		System.out.println(zoneOffset1);
		ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(6, 30);
		System.out.println(zoneOffset2);
		ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutesSeconds(9, 30, 45);
		System.out.println(zoneOffset3);

		ZoneOffset zoneOffset4 = ZoneOffset.of("+05:00");
		ZoneOffset zoneOffset5 = ZoneOffset.of("Z"); // Same as ZoneOffset.UTC
		System.out.println(zoneOffset4);
		System.out.println(zoneOffset5);

		System.out.println("ZoneOffset.UTC: " + ZoneOffset.UTC);
		System.out.println("ZoneOffset.MIN: " + ZoneOffset.MIN);
		System.out.println("ZoneOffset.MAX: " + ZoneOffset.MAX);

		ZoneId usChicago = ZoneId.of("America/Chicago");
		System.out.println(usChicago);
		ZoneId fixedZoneId = ZoneId.of("+01:00");
		System.out.println(fixedZoneId);

		Set<String> zoneIds = ZoneId.getAvailableZoneIds();
		for (String zoneId : zoneIds) {
			System.out.println(zoneId);
		}

		LocalDateTime now = LocalDateTime.now();
		ZoneId usChicago1 = ZoneId.of("America/Chicago");
		System.out.println("Zone ID:  " + usChicago1.getId());

		ZoneRules rules = usChicago1.getRules();
		System.out.println("isFixedOffset(): " + rules.isFixedOffset());
		ZoneOffset offset = rules.getOffset(now);
		System.out.println("Zone offset: " + offset);

		List<ZoneOffsetTransition> transitions = rules.getTransitions();
		System.out.println(transitions);
	}
}