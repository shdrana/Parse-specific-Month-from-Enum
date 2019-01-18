public static Months parse(String s) {
		if (s == null || s.isEmpty())
			return null; // if it the string is null it will return null

		s = s.toUpperCase();

		try {
			return valueOf(s); // Returns the matched month of S
		} catch (IllegalArgumentException e) { // if s is not match with any constant it will throw this exception
			for (Months month : values()) { // Finding the month which matched with first three letter
				String firstThreeLetterOfMonth = month.name().substring(0, 3);
				if (s.equals(firstThreeLetterOfMonth))
					return month;
			}
		}
		return null; // if it is not find any month match with first 3 simply returns null

	}