package himedia.dao;

import java.util.Date;

// Table emaillist의 레코드를 저장하기 위한 DTO 객체
// 1.기본 생성자를 가지고 있다
// 2. 비즈니스 로직을 가지지 않은 순수 데이터 객체
// 3. 필드, getters/setters
// 4. toString, equals 등 객체 관련 메서를 오버라이드 
public class EmailVo {
	//필드
	private long no;
	private String lastname;
	private String firstname;
	private String email;
	private Date CreatedAt;
	
	public EmailVo(){
	}

	public EmailVo(long no, String lastname, String firstname, String email, Date createdAt) {
		super();
		this.no = no;
		this.lastname = lastname;
		this.firstname = firstname;
		this.email = email;
		CreatedAt = createdAt;
	}
}
