package day20_DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBClass { // DB관련 기능
	private String url = "jdbc:oracle:thin:@localhost:1521:xe"; //오라클에 대한 정보
	private String id = "sj"; 
	private String pwd = "1234";
	public DBClass() {
		try {
			// 1.자바에서 오라클에 관련된 기능을 사용할 수 있게 기능을 등록하는것
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			e.printStackTrace(); // 무조건 이거 넣어줘야함 그래야 오류 발견 가능
		}
	}

	public void getList() { // DB에서 모든 데이터를 가져오는 기능
		try {// 2. 데이터베이스 연결( con 은 DB에 연결된 객체다 )
			Connection con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결이 잘 이뤄졌습니다!!");
			// 3. 데이터베이스에 연결된 객체를 이용해서 명령어를 수행할 수 있는 객체를 얻어온다.
			// 4. 명령어를 수행할 수 있는 객체를 이용해서 명령어 수행
			// 5. 수행 결과를 저장한다.
		} catch (Exception e) {
		}
	}
}
