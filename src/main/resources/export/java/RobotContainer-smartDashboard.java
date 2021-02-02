    // Smartdashboard Subsystems
#foreach ($component in $components)
#if ($helper.exportsTo("RobotContainer", $component))
#if ($component.getProperty("Send to SmartDashboard").getValue())
    SmartDashboard.putData(m_#variable($component.name));
#end
#end
#end

${Collections.reverse($components)}
    // SmartDashboard Buttons
    #set($params = $component.getProperty("Parameters").getValue())
#foreach( $component in $components )
#if ($component.getBase().getType() == "Command"
     && $component.getProperty("Button on SmartDashboard").getValue())
#if( $component.getProperty("Parameter presets").getValue().isEmpty() )
    SmartDashboard.putData("$component.getName()", #new_command_instantiation_nt($component, $component.getProperty("Parameter presets").getValue()));
#else
#foreach( $set in $component.getProperty("Parameter presets").getValue() )
    SmartDashboard.putData("$component.getName(): $set.getName()", #new_command_instantiation_nt($component, $set.getParameters()));
#end
#end
#end
#end
