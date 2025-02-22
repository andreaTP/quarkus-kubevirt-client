package io.quarkus.kubevirt.snapshot.v1alpha1.virtualmachinesnapshotcontentspec.source.virtualmachine.spec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "inferFromVolume", "kind", "name", "revisionName" })
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
public class Preference implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * InferFromVolume lists the name of a volume that should be used to infer or discover the preference to be used through
     * known annotations on the underlying resource. Once applied to the PreferenceMatcher this field is removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inferFromVolume")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("InferFromVolume lists the name of a volume that should be used to infer or discover the preference to be used through known annotations on the underlying resource. Once applied to the PreferenceMatcher this field is removed.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String inferFromVolume;

    public String getInferFromVolume() {
        return inferFromVolume;
    }

    public void setInferFromVolume(String inferFromVolume) {
        this.inferFromVolume = inferFromVolume;
    }

    /**
     * Kind specifies which preference resource is referenced. Allowed values are: "VirtualMachinePreference" and
     * "VirtualMachineClusterPreference". If not specified, "VirtualMachineClusterPreference" is used by default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Kind specifies which preference resource is referenced. Allowed values are: \"VirtualMachinePreference\" and \"VirtualMachineClusterPreference\". If not specified, \"VirtualMachineClusterPreference\" is used by default.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String kind;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    /**
     * Name is the name of the VirtualMachinePreference or VirtualMachineClusterPreference
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name is the name of the VirtualMachinePreference or VirtualMachineClusterPreference")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachinePreference or
     * VirtualMachineClusterPreference to be used. This is initially captured the first time the instancetype is applied to the
     * VirtualMachineInstance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revisionName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachinePreference or VirtualMachineClusterPreference to be used. This is initially captured the first time the instancetype is applied to the VirtualMachineInstance.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String revisionName;

    public String getRevisionName() {
        return revisionName;
    }

    public void setRevisionName(String revisionName) {
        this.revisionName = revisionName;
    }
}
