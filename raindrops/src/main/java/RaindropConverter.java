class RaindropConverter {

    String convert(int number) {
        StringBuilder raindropSpeak = new StringBuilder();
        if (number % 3 == 0)
            raindropSpeak.append("Pling");
        if (number % 5 == 0)
            raindropSpeak.append("Plang");
        if (number % 7 == 0)
            raindropSpeak.append("Plong");
        return raindropSpeak.toString().equals("") ? String.valueOf(number) : raindropSpeak.toString();
    }

}
