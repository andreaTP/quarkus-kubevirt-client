package io.quarkus.kubevirt.cdi.v1beta1.datavolumespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({ "accessModes", "dataSource", "dataSourceRef", "resources", "selector",
        "storageClassName", "volumeMode", "volumeName" })
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
public class Pvc implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AccessModes contains the desired access modes the volume should have. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessModes")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private java.util.List<String> accessModes;

    public java.util.List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(java.util.List<String> accessModes) {
        this.accessModes = accessModes;
    }

    /**
     * This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) *
     * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data
     * source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource
     * feature gate is enabled, this field will always have the same contents as the DataSourceRef field.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSource")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("This field can be used to specify either: * An existing VolumeSnapshot object (snapshot.storage.k8s.io/VolumeSnapshot) * An existing PVC (PersistentVolumeClaim) If the provisioner or an external controller can support the specified data source, it will create a new volume based on the contents of the specified data source. If the AnyVolumeDataSource feature gate is enabled, this field will always have the same contents as the DataSourceRef field.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSource dataSource;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * Specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local
     * object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified,
     * volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic
     * provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty,
     * they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the
     * same value automatically if one of them is empty and the other is non-empty. There are two important differences between
     * DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef allows any
     * non-core object, as well as PersistentVolumeClaim objects. * While DataSource ignores disallowed values (dropping them),
     * DataSourceRef preserves all values, and generates an error if a disallowed value is specified. (Alpha) Using this field
     * requires the AnyVolumeDataSource feature gate to be enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataSourceRef")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Specifies the object from which to populate the volume with data, if a non-empty volume is desired. This may be any local object from a non-empty API group (non core object) or a PersistentVolumeClaim object. When this field is specified, volume binding will only succeed if the type of the specified object matches some installed volume populator or dynamic provisioner. This field will replace the functionality of the DataSource field and as such if both fields are non-empty, they must have the same value. For backwards compatibility, both fields (DataSource and DataSourceRef) will be set to the same value automatically if one of them is empty and the other is non-empty. There are two important differences between DataSource and DataSourceRef: * While DataSource only allows two specific types of objects, DataSourceRef allows any non-core object, as well as PersistentVolumeClaim objects. * While DataSource ignores disallowed values (dropping them), DataSourceRef preserves all values, and generates an error if a disallowed value is specified. (Alpha) Using this field requires the AnyVolumeDataSource feature gate to be enabled.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSourceRef dataSourceRef;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.DataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    /**
     * Resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled
     * users are allowed to specify resource requirements that are lower than previous value but must still be higher than
     * capacity recorded in the status field of the claim. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Resources represents the minimum resources the volume should have. If RecoverVolumeExpansionFailure feature is enabled users are allowed to specify resource requirements that are lower than previous value but must still be higher than capacity recorded in the status field of the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Resources resources;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Resources getResources() {
        return resources;
    }

    public void setResources(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Resources resources) {
        this.resources = resources;
    }

    /**
     * A label query over volumes to consider for binding.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("selector")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("A label query over volumes to consider for binding.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Selector selector;

    public io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Selector getSelector() {
        return selector;
    }

    public void setSelector(io.quarkus.kubevirt.cdi.v1beta1.datavolumespec.pvc.Selector selector) {
        this.selector = selector;
    }

    /**
     * Name of the StorageClass required by the claim. More info:
     * https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageClassName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String storageClassName;

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    /**
     * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in
     * claim spec.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeMode")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeMode;

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    /**
     * VolumeName is the binding reference to the PersistentVolume backing this claim.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("VolumeName is the binding reference to the PersistentVolume backing this claim.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String volumeName;

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }
}
