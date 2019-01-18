import java.time.Year;

public enum Months {
	JANUARY("January", 31), FEBRUARY("February", 28), MARCH("March", 31), APRIL("April", 30), MAY("May", 31),
	JUNE("June", 30), JULY("July", 31), AUGUST("August", 31), SEPTEMBER("September", 30), OCTOBER("October", 31),
	NOVEMBER("November", 30), DECEMBER("December", 31);

	private String monthTitle;
	private int numberOfDay;

	private Months(String monthTitle, int numberOfDay) {
		this.monthTitle = monthTitle;
		this.numberOfDay = numberOfDay;
	}

	public static Months getMonthsFromEnum(String s) {
		if (s == null | s.isEmpty())
			return null;
		s = s.toUpperCase();

		try {
			return valueOf(s);
		} catch (IllegalArgumentException e) {
			Months[] monthList = values();
			for (Months month : monthList) {
				String firstThreeLetter = month.name().substring(0, 3);
				if (s.equals(firstThreeLetter)) {
					return month;
				}
			}
		}

		return null;

	}

	public String getTitle() {
		return this.monthTitle;
	}

	public int getNumberOfDay() {
		if (this != FEBRUARY)
			return this.numberOfDay;
		if (Year.isLeap(Year.now().getValue()))
			return 28;
		else
			return this.numberOfDay;
	}

}
