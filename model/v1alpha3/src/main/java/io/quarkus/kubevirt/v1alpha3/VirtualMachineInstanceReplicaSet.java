package io.quarkus.kubevirt.v1alpha3;

@io.fabric8.kubernetes.model.annotation.Version(value = "v1alpha3", storage = true, served = true)
@io.fabric8.kubernetes.model.annotation.Group("kubevirt.io")
@io.fabric8.kubernetes.model.annotation.Singular("virtualmachineinstancereplicaset")
@io.fabric8.kubernetes.model.annotation.Plural("virtualmachineinstancereplicasets")
@lombok.ToString()
@lombok.EqualsAndHashCode(callSuper = true)
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
public class VirtualMachineInstanceReplicaSet extends
        io.fabric8.kubernetes.client.CustomResource<io.quarkus.kubevirt.v1alpha3.VirtualMachineInstanceReplicaSetSpec, io.quarkus.kubevirt.v1alpha3.VirtualMachineInstanceReplicaSetStatus>
        implements io.fabric8.kubernetes.api.model.Namespaced {
}
