package string;

public class FindK {
	public String solution(String[] seoul) {
	      String answer = "";
	      
	      for(int i = 0; i < seoul.length; i++) {
	    	  if(("Kim").equals(seoul[i])) {
	    		  answer = "김서방은 " + i +"에 있다";
	    	  }
	      }      
	      return answer;
	  }
	
	public static void main(String[] args) {
		FindK find = new FindK();
		String[] array = {"Jane", "Jane", "Kim"};
		String result = find.solution(array);
		System.out.println(result);
	}

}
