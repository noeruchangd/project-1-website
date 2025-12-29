package com.soict.project1.interfaces;

public interface AccountCreateInterface {
    /**
     * Creates an account with the given details.
     *
     * @param username the username for the account
     * @param email the email for the account
     * @param password the password for the account
     * @return true if the account was created successfully, false otherwise
     */
    boolean createAccount(String username, String email, String password);
}
