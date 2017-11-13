package com.dubatovka.simplewebapp.command;

import com.dubatovka.simplewebapp.command.impl.GoToIndexCommand;
import com.dubatovka.simplewebapp.command.impl.ShowAllUsersCommand;
import com.dubatovka.simplewebapp.command.impl.ShowUsersByCriteriaCommand;
import com.dubatovka.simplewebapp.manager.ConfigConstant;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

public class CommandFactory {
    private static final Logger LOGGER = LogManager.getLogger(CommandFactory.class);
    private static HashMap<CommandType, Command> commands = new HashMap<>();
    
    static {
        commands.put(CommandType.SHOW_ALL_USERS, new ShowAllUsersCommand());
        commands.put(CommandType.SHOW_USERS_BY_CRITERIA, new ShowUsersByCriteriaCommand());
        commands.put(CommandType.GO_TO_INDEX, new GoToIndexCommand());
    }
    
    private enum CommandType {
        SHOW_ALL_USERS,
        SHOW_USERS_BY_CRITERIA,
        GO_TO_INDEX;
    }
    
    private CommandFactory() {
    }
    
    public static Command defineCommand(HttpServletRequest request) {
        String commandName = request.getParameter(ConfigConstant.PARAM_COMMAND);
        if (!validateCommandName(commandName)) {
            LOGGER.log(Level.ERROR, "Request doesn't have command parameter or it is invalid: " + commandName + ". Check JSP.");
            return new GoToIndexCommand();
        }
        return defineCommand(commandName);
    }
    
    private static boolean validateCommandName(String commandName) {
        if (commandName == null || commandName.trim().isEmpty()) {
            return false;
        }
        for (CommandType type : CommandType.values()) {
            if (type.toString().equalsIgnoreCase(commandName)) {
                return true;
            }
        }
        return false;
    }
    
    private static Command defineCommand(String commandName) {
        commandName = commandName.trim().toUpperCase();
        CommandType commandType = CommandType.valueOf(commandName);
        Command command = commands.get(commandType);
        
        if (command == null) {
            command = new GoToIndexCommand();
        }
        return command;
    }
}