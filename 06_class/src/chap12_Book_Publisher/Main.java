package chap12_Book_Publisher;

// 문제. Book 객체를 만들고 Setter를 호출하여 적절한 정보를 저장하세요.
//       정보 저장 뒤 Getter를 호출하여 해당 정보를 확인하세요.

public class Main {

  public static void main(String[] args) {
	  
	  Book bk = new Book();
	  Publisher pb = new Publisher();
	  Contact ct = new Contact();
	  
	  bk.setTitle("책제목");
	  bk.setPublisher(pb);
	  pb.setName("이름");
	  pb.setLocation("로케이션");
	  pb.setContact(ct);
	  ct.setFax("팩스");
	  ct.setTel("번호");
	  
	  System.out.println(bk.getTitle());
	  System.out.println(bk.getPublisher().getName());
	  System.out.println(bk.getPublisher().getLocation());
	  System.out.println(bk.getPublisher().getContact().getTel());
	  System.out.println(bk.getPublisher().getContact().getFax());
    
  }

}
