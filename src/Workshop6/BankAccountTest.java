package Workshop6;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDepositAndWithdraw() {
        BankAccount account = new BankAccount();

        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());

        account.withdraw(50.0);
        assertEquals(50.0, account.getBalance());

        assertFalse(account.withdraw(60.0));
        assertEquals(50.0, account.getBalance());
    }
}
