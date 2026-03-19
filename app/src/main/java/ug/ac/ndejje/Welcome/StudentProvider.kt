package ug.ac.ndejje.Welcome

class StudentProvider {
    companion object {
        val studentList = listOf(
            Student(1, "Akello Stellamaris", "24/2/314/01", "BIT", R.drawable.female_1,   true),
            Student(2, "Kirya James",       "24/2/314/02", "BCS", R.drawable.male_1,     false),
            Student(3, "Mbabazi Joan",      "24/2/314/03", "BIT", R.drawable.female_2, true),
            Student(4, "Kato Johnmary",     "24/2/314/04", "BSE", R.drawable.male_2,     true),
            Student(5, "Nakato Joan",     "24/2/314/05", "BSE", R.drawable.female_3,     false),
            Student(6, "Nandyowa Mellisa",     "24/2/314/06", "BIT", R.drawable.mellisa,     true),
            Student(7, "Muhereza Josephat",     "24/2/314/07", "BCS", R.drawable.muhereza,     false)
        )
    }
}