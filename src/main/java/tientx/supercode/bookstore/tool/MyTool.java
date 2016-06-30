/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tientx.supercode.bookstore.tool;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Calendar;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author zOzDarKzOz
 */
public class MyTool {

    public static String encodeByBase64(String str) {
        try {
            byte[] bytesEncoded = str.getBytes();
            return (Base64.getEncoder().encodeToString(bytesEncoded));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String decodeByBase64(String encode) {
        try {
            byte[] bs = Base64.getDecoder().decode(encode);
            return new String(bs);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String handleLink(String title, Integer id) {
        try {
            String sId = encodeByBase64(id + "");
            title = title.trim();
            title = title.replaceAll("(à|á|ạ|ả|ã|â|ầ|ấ|ậ|ẩ|ẫ|ă|ằ|ắ|ặ|ẳ|ẵ)", "a");
            title = title.replaceAll("(è|é|ẹ|ẻ|ẽ|ê|ề|ế|ệ|ể|ễ)", "e");
            title = title.replaceAll("(ì|í|ị|ỉ|ĩ)", "i");
            title = title.replaceAll("(ò|ó|ọ|ỏ|õ|ô|ồ|ố|ộ|ổ|ỗ|ơ|ờ|ớ|ợ|ở|ỡ)", "o");
            title = title.replaceAll("(ù|ú|ụ|ủ|ũ|ư|ừ|ứ|ự|ử|ữ)", "u");
            title = title.replaceAll("(ỳ|ý|ỵ|ỷ|ỹ)", "y");
            title = title.replaceAll("(đ)", "d");
            title = title.replaceAll("ç", "c");
            title = title.replaceAll("Ç", "C");
            title = title.replaceAll("\\`|\\~|\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|\\(|"
                    + "\\)|\\_|\\=|\\+|\\{|\\[|\\}|\\]|\\<|\\,|\\>|\\.|\\?|"
                    + "\\/|\\;|\\:", "");
            title = title.replaceAll("(À|Á|Ạ|Ả|Ã|Â|Ầ|Ấ|Ậ|Ẩ|Ẫ|Ă|Ằ|Ắ|Ặ|Ẳ|Ẵ)", "A");
            title = title.replaceAll("(È|É|Ẹ|Ẻ|Ẽ|Ê|Ề|Ế|Ệ|Ể|Ễ)", "E");
            title = title.replaceAll("(Ì|Í|Ị|Ỉ|Ĩ)", "I");
            title = title.replaceAll("(Ò|Ó|Ọ|Ỏ|Õ|Ô|Ồ|Ố|Ộ|Ổ|Ỗ|Ơ|Ờ|Ớ|Ợ|Ở|Ỡ)", "O");
            title = title.replaceAll("(Ù|Ú|Ụ|Ủ|Ũ|Ư|Ừ|Ứ|Ự|Ử|Ữ)", "U");
            title = title.replaceAll("(Ỳ|Ý|Ỵ|Ỷ|Ỹ)", "Y");
            title = title.replaceAll("(Đ)", "D");
            title = title.replaceAll("'", "");
            title = title.toLowerCase();
            title = title.replaceAll("\\s+", "-");
            title = title.replaceAll("\\-+", "-");
            return (title + "-" + sId);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Integer extractIdFromLink(String str) {
        try {
            String[] s = str.trim().split("-");
            String sId = s[s.length - 1];
            sId = decodeByBase64(sId);
            Integer id = Integer.parseInt(sId);
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public static String getCurrentTimeInYYYYMMDDHH24mmssFormatString() {
        String res = "Ha Noi, ";
        try {
            Calendar c = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            DateFormat df = new SimpleDateFormat("EEEE");
            res += df.format(c.getTime()) + ", " + sdf.format(c.getTime());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

    public static String handleParameterString(String str) {
        str = str.replaceAll("\\&lang=vi", "");
        str = str.replaceAll("\\&lang=en", "");
        str = str.replaceAll("lang=en", "");
        str = str.replaceAll("lang=vi", "");
        if (str.contains("=")) {
            str += "&";
        }
        return str;
    }

    public static void setModelData(ModelAndView mav,
            String currentPage, HttpServletRequest request) {
        mav.addObject("currentPage", "Home");
        mav.addObject("currentTime", MyTool.getCurrentTimeInYYYYMMDDHH24mmssFormatString());
        String currentParameter = request.getQueryString();
        if (currentParameter != null) {
            currentParameter = MyTool.handleParameterString(currentParameter);
            mav.addObject("vihref", request.getRequestURI() + "?" + currentParameter + "lang=vi");
            mav.addObject("enhref", request.getRequestURI() + "?" + currentParameter + "lang=en");
        } else {
            mav.addObject("vihref", "?lang=vi");
            mav.addObject("enhref", "?lang=en");
        }
    }
}
