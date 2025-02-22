package io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "timer", "timezone", "utc" })
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
public class Clock implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Timer specifies whih timers are attached to the vmi.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timer")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timer specifies whih timers are attached to the vmi.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Timer timer;

    public io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Timer getTimer() {
        return timer;
    }

    public void setTimer(io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Timer timer) {
        this.timer = timer;
    }

    /**
     * Timezone sets the guest clock to the specified timezone. Zone name follows the TZ environment variable format (e.g.
     * 'America/New_York').
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Timezone sets the guest clock to the specified timezone. Zone name follows the TZ environment variable format (e.g. 'America/New_York').")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String timezone;

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * UTC sets the guest clock to UTC on each boot. If an offset is specified, guest changes to the clock will be kept during
     * reboots and are not reset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("utc")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("UTC sets the guest clock to UTC on each boot. If an offset is specified, guest changes to the clock will be kept during reboots and are not reset.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Utc utc;

    public io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Utc getUtc() {
        return utc;
    }

    public void setUtc(io.quarkus.kubevirt.v1alpha3.virtualmachinespec.template.spec.domain.clock.Utc utc) {
        this.utc = utc;
    }
}
