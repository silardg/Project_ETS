package rs.edu.etspupin.www.ets_official;



public class ordinary {

    /* emoji hex codes */
    public int emoji_graduatehat = 0x1F393;

    public String getEmojiByUnicode(int unicode){
        /*
        https://apps.timwhitlock.info/emoji/tables/unicode
         */
        return new String(Character.toChars(unicode));
    }
}
