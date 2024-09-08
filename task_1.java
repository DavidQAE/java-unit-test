@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
	boolean expected = true;
    assertEquals("Возраст должен быть 18 и выше, чтобы вывелось true", expected, isAdult);
}
