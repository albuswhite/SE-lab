# SE-lab

To model the Bank, you need a collection (ArrayList is a good choice) of Bank Accounts as the instance variable. "Open account" means create a new BankAccount object and add it to the collection. "Close account" means remove the BankAccount object from the collection and destroy this object.

you need to give 7 days notice to withdraw fund. You could add a "notice date" instance variable for the account and a "give notice" method. When the user access the "withdraw" method, the notice date should be checked first and if it is not 7 days already, the withdraw request should be rejected.