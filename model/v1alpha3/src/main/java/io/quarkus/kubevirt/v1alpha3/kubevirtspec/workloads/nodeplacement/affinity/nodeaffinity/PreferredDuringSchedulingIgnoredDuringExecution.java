package io.quarkus.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preference", "weight" })
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
public class PreferredDuringSchedulingIgnoredDuringExecution implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * A node selector term, associated with the corresponding weight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preference")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A node selector term, associated with the corresponding weight.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference;

    public io.quarkus.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference getPreference() {
        return preference;
    }

    public void setPreference(
            io.quarkus.kubevirt.v1alpha3.kubevirtspec.workloads.nodeplacement.affinity.nodeaffinity.preferredduringschedulingignoredduringexecution.Preference preference) {
        this.preference = preference;
    }

    /**
     * Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    @io.fabric8.generator.annotation.Required()
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Weight associated with matching the corresponding nodeSelectorTerm, in the range 1-100.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Integer weight;

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
