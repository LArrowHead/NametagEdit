package com.nametagedit.plugin.api;

import org.bukkit.entity.Player;

public interface INametagApi {

    /**
     * Removes a player's nametag in memory
     * only.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player whose nametag to clear
     */
    void clearNametag(Player player);

    /**
     * Removes a player's nametag in memory
     * only.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player whose nametag to clear
     */
    void clearNametag(String player);

    /**
     * Sets the prefix for a player. The previous
     * suffix is kept if it exists.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param prefix the prefix to change to
     */
    void setPrefix(Player player, String prefix);

    /**
     * Sets the suffix for a player. The previous
     * prefix is kept if it exists.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param suffix the suffix to change to
     */
    void setSuffix(Player player, String suffix);

    /**
     * Sets the prefix for a player. The previous
     * suffix is kept if it exists.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param prefix the prefix to change to
     */
    void setPrefix(String player, String prefix);

    /**
     * Sets the suffix for a player. The previous
     * prefix is kept if it exists.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param suffix the suffix to change to
     */
    void setSuffix(String player, String suffix);

    /**
     * Sets the nametag for a player.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param prefix the prefix to change to
     * @param suffix the suffix to change to
     */
    void setNametag(Player player, String prefix, String suffix);

    /**
     * Sets the nametag for a player.
     * <p>
     * Note: Only affects memory, does NOT
     * add/remove from storage.
     *
     * @param player the player whose nametag to change
     * @param prefix the prefix to change to
     * @param suffix the suffix to change to
     */
    void setNametag(String player, String prefix, String suffix);

}