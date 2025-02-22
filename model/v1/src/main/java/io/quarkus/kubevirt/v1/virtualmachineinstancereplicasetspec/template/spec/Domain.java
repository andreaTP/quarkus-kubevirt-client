package io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "chassis", "clock", "cpu", "devices", "features", "firmware",
        "ioThreadsPolicy", "launchSecurity", "machine", "memory", "resources" })
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
        @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class Domain implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Chassis specifies the chassis info passed to the domain.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("chassis")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Chassis specifies the chassis info passed to the domain.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Chassis chassis;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Chassis getChassis() {
        return chassis;
    }

    public void setChassis(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Chassis chassis) {
        this.chassis = chassis;
    }

    /**
     * Clock sets the clock and timers of the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clock")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Clock sets the clock and timers of the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Clock clock;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Clock getClock() {
        return clock;
    }

    public void setClock(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Clock clock) {
        this.clock = clock;
    }

    /**
     * CPU allow specified the detailed CPU topology inside the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpu")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("CPU allow specified the detailed CPU topology inside the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Cpu cpu;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Cpu getCpu() {
        return cpu;
    }

    public void setCpu(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Cpu cpu) {
        this.cpu = cpu;
    }

    /**
     * Devices allows adding disks, network interfaces, and others
     */
    @com.fasterxml.jackson.annotation.JsonProperty("devices")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Devices allows adding disks, network interfaces, and others")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Devices devices;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Devices getDevices() {
        return devices;
    }

    public void setDevices(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Devices devices) {
        this.devices = devices;
    }

    /**
     * Features like acpi, apic, hyperv, smm.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("features")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Features like acpi, apic, hyperv, smm.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Features features;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Features getFeatures() {
        return features;
    }

    public void setFeatures(
            io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Features features) {
        this.features = features;
    }

    /**
     * Firmware.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("firmware")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Firmware.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Firmware firmware;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Firmware getFirmware() {
        return firmware;
    }

    public void setFirmware(
            io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Firmware firmware) {
        this.firmware = firmware;
    }

    /**
     * Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared,
     * auto
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ioThreadsPolicy")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared, auto")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String ioThreadsPolicy;

    public String getIoThreadsPolicy() {
        return ioThreadsPolicy;
    }

    public void setIoThreadsPolicy(String ioThreadsPolicy) {
        this.ioThreadsPolicy = ioThreadsPolicy;
    }

    /**
     * Launch Security setting of the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("launchSecurity")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Launch Security setting of the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.LaunchSecurity launchSecurity;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.LaunchSecurity getLaunchSecurity() {
        return launchSecurity;
    }

    public void setLaunchSecurity(
            io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.LaunchSecurity launchSecurity) {
        this.launchSecurity = launchSecurity;
    }

    /**
     * Machine type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("machine")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Machine type.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Machine machine;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Machine getMachine() {
        return machine;
    }

    public void setMachine(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Machine machine) {
        this.machine = machine;
    }

    /**
     * Memory allow specifying the VMI memory features.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("memory")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Memory allow specifying the VMI memory features.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Memory memory;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Memory getMemory() {
        return memory;
    }

    public void setMemory(io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Memory memory) {
        this.memory = memory;
    }

    /**
     * Resources describes the Compute Resources required by this vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources describes the Compute Resources required by this vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Resources resources;

    public io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Resources getResources() {
        return resources;
    }

    public void setResources(
            io.quarkus.kubevirt.v1.virtualmachineinstancereplicasetspec.template.spec.domain.Resources resources) {
        this.resources = resources;
    }
}
