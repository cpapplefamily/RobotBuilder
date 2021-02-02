#set($command = $helper.getByName($command_name, $robot))
#set($params = $command.getProperty("Parameters").getValue())
#foreach($param in $params)
        m_$param.getName() = $param.getName();
#end
#if($command.getProperty("DoubleSupplier 1").getValue() != "None")m_#variable($command.getProperty("DoubleSupplier 1").getValue()) = #variable($command.getProperty("DoubleSupplier 1").getValue()); #end

        #if($command.getProperty("DoubleSupplier 2").getValue() != "None")m_#variable($command.getProperty("DoubleSupplier 2").getValue()) = #variable($command.getProperty("DoubleSupplier 2").getValue()); #end