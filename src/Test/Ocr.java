package Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ocr {

    public static void main(String[] args) {
        String ocrText = "2017년4월10일 서울특별시 송파구 신천동 철골철근콘크리트구조 29 (철근)콘크리트지붕 롯데월드타워앤드롯데월드몰 123층 판매시설,문화 및 제월드타워동 집회시설, [도로명주소] 업무시설,숙박시설,관광휴 서울특별시 송파구 올림픽로 게시설 300 지6층 13869.58m2 지5층";

        String address = extractAddress(ocrText);
        System.out.println("Extracted Address: " + address);
    }

    public static String extractAddress(String text) {
        // "서울특별시", "송파구", "신천동", "숫자" 패턴
        String pattern = "(서울특별시\\s*[가-힣]+구\\s*[가-힣]+동\\s*\\d+).*";

        Pattern addressPattern = Pattern.compile(pattern);
        Matcher matcher = addressPattern.matcher(text);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return "Address not found";
    }
}