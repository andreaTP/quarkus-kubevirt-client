package io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "preferredDuringSchedulingIgnoredDuringExecution",
        "requiredDuringSchedulingIgnoredDuringExecution" })
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
public class NodeAffinity implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it
     * may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the
     * greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request,
     * requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and
     * adding "weight" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are
     * the most preferred.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("The scheduler will prefer to schedule pods to nodes that satisfy the affinity expressions specified by this field, but it may choose a node that violates one or more of the expressions. The node that is most preferred is the one with the greatest sum of weights, i.e. for each node that meets all of the scheduling requirements (resource request, requiredDuringScheduling affinity expressions, etc.), compute a sum by iterating through the elements of this field and adding \"weight\" to the sum if the node matches the corresponding matchExpressions; the node(s) with the highest sum are the most preferred.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution;

    public java.util.List<io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> getPreferredDuringSchedulingIgnoredDuringExecution() {
        return preferredDuringSchedulingIgnoredDuringExecution;
    }

    public void setPreferredDuringSchedulingIgnoredDuringExecution(
            java.util.List<io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.PreferredDuringSchedulingIgnoredDuringExecution> preferredDuringSchedulingIgnoredDuringExecution) {
        this.preferredDuringSchedulingIgnoredDuringExecution = preferredDuringSchedulingIgnoredDuringExecution;
    }

    /**
     * If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto
     * the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g.
     * due to an update), the system may or may not try to eventually evict the pod from its node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requiredDuringSchedulingIgnoredDuringExecution")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("If the affinity requirements specified by this field are not met at scheduling time, the pod will not be scheduled onto the node. If the affinity requirements specified by this field cease to be met at some point during pod execution (e.g. due to an update), the system may or may not try to eventually evict the pod from its node.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution;

    public io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution getRequiredDuringSchedulingIgnoredDuringExecution() {
        return requiredDuringSchedulingIgnoredDuringExecution;
    }

    public void setRequiredDuringSchedulingIgnoredDuringExecution(
            io.quarkus.kubevirt.v1.virtualmachinespec.template.spec.affinity.nodeaffinity.RequiredDuringSchedulingIgnoredDuringExecution requiredDuringSchedulingIgnoredDuringExecution) {
        this.requiredDuringSchedulingIgnoredDuringExecution = requiredDuringSchedulingIgnoredDuringExecution;
    }
}
