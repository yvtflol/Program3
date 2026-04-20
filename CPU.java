/* * Name: Tarik Kameric
 * Assignment: Program 3
 */

public class CPU {
    private String modelName;
    private int cores; // Primitive property

    public CPU() {
        this.setModelName("Generic CPU");
        this.setCores(4);
    }

    public CPU(String modelName, int cores) {
        this.setModelName(modelName);
        this.setCores(cores);
    }

    public int getCores() { return cores; }

    // Invariant: A CPU must have at least 1 core
    private void setCores(int cores) {
        if (cores <= 0) {
            this.cores = 1; 
        } else {
            this.cores = cores;
        }
    }

    public String getModelName() { return modelName; }
    private void setModelName(String modelName) {
        this.modelName = (modelName == null || modelName.isEmpty()) ? "Unknown" : modelName;
    }

    // Overloaded method: overclocking the CPU
    public void overclock(int extraCores) {
        this.setCores(this.cores + extraCores);
    }

    public void overclock() {
        this.overclock(2); // Default boost
    }

    @Override
    public String toString() {
        return modelName + " with " + cores + " cores";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof CPU)) return false;
        CPU other = (CPU) obj;
        return this.cores == other.cores && this.modelName.equals(other.modelName);
    }
}