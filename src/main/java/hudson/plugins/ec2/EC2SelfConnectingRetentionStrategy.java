package hudson.plugins.ec2;

public class EC2SelfConnectingRetentionStrategy extends EC2RetentionStrategy {

    public EC2SelfConnectingRetentionStrategy(String idleTerminationMinutes) {
        super(idleTerminationMinutes);
    }

    @Override
    public void start(EC2Computer c) {
        // Do nothing, wait for the slave to connect via JNLP
        // By doing nothing we prevent the failed connection error from
        // displaying to the user
    }
}