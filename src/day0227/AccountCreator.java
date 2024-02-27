package day0227;

/*
 * singleton
 * 객체의 인스턴스가 오직 1개만 생성되는 패턴
 * private로 선언된 생성자 - singleton patton
 */

/**
 * singleton patton
 */
public class AccountCreator {
    // static 공간에 객체 생성
    private static AccountCreator accountCreator;
    private int accountNo = 0;
    
    // AccountCreator 생성자 호출을 막음 -> new로 호출 불가
    private AccountCreator() {

    }

    // accountCreator가 없을 경우에만 생성이 됨
    public static AccountCreator getAccountCreator() {
        if (accountCreator == null) 
            accountCreator = new AccountCreator();
        return accountCreator;
    }

    public int getNextAccountNo() {
        return this.accountNo++;
    }
}

class Test3 {
    public static void main(String[] args) {
        // private로 지정된 생성자로 인해 객체 생성 안됨
        // AccountCreator accountCreator = new AccountCreator();
        
        // AccountCreator 내부의 static(정적) 메서드를 이용해 생성
        // static 메서드이기 때문에 무조건 1개만 생성됨
        
        
    }
}


/*
 * static 공간에 객체 생성
 * static 공간에 생성된 객체를 참조하도록 설계
 * createAccount는.. 같은 클래스에 있기 때문에 클래스 내부에서는
 * account가 생성이 된다.
 * 먼말이징..??ㅜㅜ
 */
