/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logon;

/**
 *
 * @author Ecslogon2
 */
public interface LogonInterface {
    public boolean doLogon(String user);
    public void openSettings();
    public void setRemember();
}
