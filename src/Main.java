//Учитывая массив строк words, верните массив всех символов, которые встречаются во всех строках внутри words(включая дубликаты) .
//Вы можете вернуть ответ в любом порядке . Ввод: word = ["bella","label","roller"] Выход: ["e","l","l"]

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] words = new String[]{"bella", "label", "roller"};
    System.out.println(searchForMatch(words));
  }

  //метод для поиска совпадений
  public static ArrayList<Character> searchForMatch(String[] words) {
    char[] firstWordChars = words[0].toCharArray();
    ArrayList<Character> duplicates = new ArrayList<>();
    for (int i = 0; i < firstWordChars.length; i++) { //перебираю символы первого слова
      boolean isLetterExsistInAllWord = true; //буква существует во всех словах
      int j;
      for (j = 1; j < words.length; j++) {
        boolean isLetterExsistInCurrentWord; //буква существует в текущем слове
        isLetterExsistInCurrentWord = words[j].indexOf(firstWordChars[i]) != -1; // с помощью indexOf() мы передаем в него ссылку на нужный объект, и indexOf() возвращает нам его индекс
        isLetterExsistInAllWord = isLetterExsistInAllWord && isLetterExsistInCurrentWord; // сравниваем все символы между собой
      }
      if (isLetterExsistInAllWord) duplicates.add(firstWordChars[i]); // если символ существует, добавляем его в конец
    }
    return duplicates;
  }
}
