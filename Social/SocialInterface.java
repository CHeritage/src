/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Social;

import java.util.List;

/**
 *
 * @author Ecslogon2
 */
public interface SocialInterface {
    public List<String> playerList;
    private List<String> messages;
    
    public boolean updatePlayers(String player);
    public boolean updateMessages(String message);
    public boolean updateUser();
}
