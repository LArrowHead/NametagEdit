package com.nametagedit.plugin.storage.database.tasks;

import com.nametagedit.plugin.api.data.PlayerData;
import com.nametagedit.plugin.utils.Utils;
import com.zaxxer.hikari.HikariDataSource;
import lombok.AllArgsConstructor;
import org.bukkit.scheduler.BukkitRunnable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@AllArgsConstructor
public class PlayerSaver extends BukkitRunnable {

    private PlayerData playerData;
    private HikariDataSource hikari;

    @Override
    public void run() {
        try (Connection connection = hikari.getConnection()) {
            final String QUERY = "INSERT INTO `nte_players` VALUES(?, ?, ?, ?, ?) ON DUPLICATE KEY UPDATE `prefix`=?, `suffix`=?, `priority`=?";
            PreparedStatement insertOrUpdate = connection.prepareStatement(QUERY);
            insertOrUpdate.setString(1, playerData.getUuid().toString());
            insertOrUpdate.setString(2, playerData.getName());
            insertOrUpdate.setString(3, Utils.deformat(playerData.getPrefix()));
            insertOrUpdate.setString(4, Utils.deformat(playerData.getSuffix()));
            insertOrUpdate.setInt(5, -1);
            insertOrUpdate.setString(6, Utils.deformat(playerData.getPrefix()));
            insertOrUpdate.setString(7, Utils.deformat(playerData.getSuffix()));
            insertOrUpdate.setInt(8, playerData.getSortPriority());
            insertOrUpdate.execute();
            insertOrUpdate.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}