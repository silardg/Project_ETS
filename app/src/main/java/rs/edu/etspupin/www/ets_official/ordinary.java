package rs.edu.etspupin.www.ets_official;



public class ordinary {

    /* emoji hex codes */
    public int emoji_graduatehat = 0x1F393;

    /*
        Function:       public String getEmojiByUnicode(int unicode)
        Description:    Returns a string that is an emoji based on the unicode which
                        can be found on https://apps.timwhitlock.info/emoji/tables/unicode
     */
    public String getEmojiByUnicode(int unicode){ return new String(Character.toChars(unicode)); }
}
