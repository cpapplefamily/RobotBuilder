#header()

#set($command = $helper.getByName($command_name, $robot))
#set($commandDescriptors = $command.getProperty("Commands").getValue())

\#include "Commands/#class($command.name).h"
#foreach( $cd in $commandDescriptors )
\#include "Commands/#class($cd.getName()).h"
#end


#@autogenerated_code("constructor", "")
#parse("${exporter_path}CommandGroup-constructor.cpp")
#end ##autogenerated
    // Add Commands here:
    // e.g. AddSequential(new Command1());
    //      AddSequential(new Command2());
    // these will run in order.

    // To run multiple commands at the same time,
    // use AddParallel()
    // e.g. AddParallel(new Command1());
    //      AddSequential(new Command2());
    // Command1 and Command2 will run in parallel.

    // A command group will require all of the subsystems that each member
    // would require.
    // e.g. if Command1 requires chassis, and Command2 requires arm,
    // a CommandGroup containing them would require both the chassis and the
    // arm.
        #@autogenerated_code("command_declarations", "      ")
        #parse("${exporter_path}CommandGroup-declarations.cpp")
        #end ##autogenerated
}