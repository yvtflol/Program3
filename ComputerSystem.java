/* * Name: Tarik Kameric
 * Assignment: Program 3
 */

public class ComputerSystem {
    private String buildName;
    private CPU processor; // Reference-type property (Composition)

    public ComputerSystem(String buildName) {
        this.setBuildName(buildName);
        this.setProcessor(new CPU());
    }

    public ComputerSystem(String buildName, CPU processor) {
        this.setBuildName(buildName);
        this.setProcessor(processor);
    }

    public CPU getProcessor() { return processor; }

    // Invariant: System cannot function without a CPU
    private void setProcessor(CPU processor) {
        this.processor = (processor == null) ? new CPU() : processor;
    }

    public String getBuildName() { return buildName; }
    private void setBuildName(String buildName) {
        this.buildName = (buildName == null) ? "New Build" : buildName;
    }

    // Overloaded method: upgrade the system
    public void upgrade(String newName) {
        this.setBuildName(newName);
    }

    public void upgrade(String newName, CPU newCpu) {
        this.setBuildName(newName);
        this.setProcessor(newCpu);
    }

    @Override
    public String toString() {
        return "Build: " + buildName + " | Specs: " + processor.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ComputerSystem)) return false;
        ComputerSystem other = (ComputerSystem) obj;
        return this.buildName.equals(other.buildName) && this.processor.equals(other.processor);
    }
}