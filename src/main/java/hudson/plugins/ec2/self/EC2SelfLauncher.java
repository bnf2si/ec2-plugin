package hudson.plugins.ec2.self;

import java.io.PrintStream;

import hudson.model.TaskListener;
import hudson.plugins.ec2.EC2Computer;
import hudson.slaves.JNLPLauncher;
import hudson.slaves.SlaveComputer;

public class EC2SelfLauncher extends JNLPLauncher {
    
    @Override
    public void launch(SlaveComputer _computer, TaskListener listener) {
        EC2Computer computer = (EC2Computer) _computer;
        PrintStream logger = listener.getLogger();

        logger.println("The instance " + computer.getNode().getNodeName() + " is a self-connecting agent.");
        logger.println("Waiting for the instance to register itself with JNLP as " + computer.getNode().getNodeName());
    }
}
