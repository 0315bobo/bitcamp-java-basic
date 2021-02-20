package Hw;

public class PCC_regex {
	public static void main(String[] args) {
		
		
		/*
		//개인통관고유부호 
        PCCC(Personal Customs Clearance Code) 
        PCC(Personal Clearance Code)
        
		개인 : 모든 개인통관고유부호에 P를 기재
		출생년도 : 출생년도 중 끝 2자리를 기재
		성별 : 1(남자), 2(여자), 5(외국인남자), 6(외국인여자)
		발급년도 : 부호를 발급한 연도중 끝 2자리를 기재
		부여번호 : 무작위 선택 부여
		오류검증부호부호 : 부여나 입력의 오류를 체크하기 위한 부호
		*/
		
		
		//개인통관고유부호 
		//개인	출생년도   	 성별	        발급년도    부여번호	   오류검증부호
        //P     2자리         1자리         2자리      6자리      1자리
		//     연도 끝자리     1,2,5,6     연도 끝자리
		
		String pattern = "^P\\d{2}(1|2|5|6)\\d{2}\\d{6}\\d{1}$";
		String PCC = "P211234567891";
		
		System.out.println("PCC test : " + PCC.matches(pattern));
		
		
		//해설
		// ^ : 문자열 시작         
		// P\\{2} : P뒤로 2자리 숫자              >> 출생년도 끝자리
		// (1|2|5|6) : 1 또는 2 또는 5 또는 6     >> 성별
		// \\d{2} : 2자리 숫자                   >> 발급년도 끝자리
		// \\d{6} : 6자리 숫자                   >> 부여번호 
		// \\d{1} : 1자리 숫자                   >> 오류검증부호 
		
		

	}

}
