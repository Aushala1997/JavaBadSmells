
public class MultiLinugualStringTable {
  private enum LanguageSetting {
    ENGLISH, KLINGON
  }

  private static LanguageSetting cl = LanguageSetting.ENGLISH;
  private static String[] em = { "Enter your name:", "Welcome", "Have a good time playing Abominodo" };
  private static String[] km = { "'el lIj pong:", "nuqneH", "QaQ poH Abominodo" };

  public static String getMessage(int index) {
    if (cl == LanguageSetting.ENGLISH) {
      return em[index];
    } else {
      return km[index];
    }

  }
}
