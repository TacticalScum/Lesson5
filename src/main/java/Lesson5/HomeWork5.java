package Lesson5;

public class HomeWork5 {
    public static void main(String[] args) {

        Employers[] workersArray = new Employers[5];
        workersArray[0] = new Employers("Петров Семен Иванович", "Санитар", "PetrovSI@company.ru",
                "89542831495", "28000", 32);
        workersArray[1] = new Employers("Воробьёва Татьяна Вадимовна", "Терапевт", "VorobevaTV@company.ru",
                "89345218724", "35000", 50);
        workersArray[2] = new Employers("Жилина Тамара Дмитриевна", "Гинеколог", "GilinaTD@company.ru",
                "89624520977", "48000", 23);
        workersArray[3] = new Employers("Проскуренко Павел Анатольевич", "Зав. отделения реанимации", "ProskurenkoPA@company.ru",
                "89467285491", "70000", 46);
        workersArray[4] = new Employers("Сахаров Егор Адександрович", "Химик-биолог", "SaharovEA@company.ru",
                "89109853471", "54000", 40);

        for (int i = 0; i < workersArray.length; i++) {
            if (workersArray[i].getWorkersAge() >= 40) {
                System.out.println("Старше 40 лет: " + workersArray[i]);
            }
        }
    }
}
