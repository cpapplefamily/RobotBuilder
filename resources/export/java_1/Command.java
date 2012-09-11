// ${version-indicator}

package ${package}.commands;
#set($command = $helper.getByName($command-name, $robot))

import edu.wpi.first.wpilibj.command.Command;
import ${package}.Robot;

/**
 *
 */
public class  #class($command.name) extends Command {

    public #class($command.name)() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
#@autogenerated_code("requires", "        ")
#parse("${exporter-path}Command-requires.java")
#end
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
