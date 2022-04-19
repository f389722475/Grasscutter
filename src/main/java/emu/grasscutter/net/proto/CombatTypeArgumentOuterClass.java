// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombatTypeArgument.proto

package emu.grasscutter.net.proto;

public final class CombatTypeArgumentOuterClass {
  private CombatTypeArgumentOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code CombatTypeArgument}
   */
  public enum CombatTypeArgument
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CombatNone = 0;</code>
     */
    CombatNone(0),
    /**
     * <code>CombatEvtBeingHit = 1;</code>
     */
    CombatEvtBeingHit(1),
    /**
     * <code>CombatAnimatorStateChanged = 2;</code>
     */
    CombatAnimatorStateChanged(2),
    /**
     * <code>CombatFaceToDir = 3;</code>
     */
    CombatFaceToDir(3),
    /**
     * <code>CombatSetAttackTarget = 4;</code>
     */
    CombatSetAttackTarget(4),
    /**
     * <code>CombatRushMove = 5;</code>
     */
    CombatRushMove(5),
    /**
     * <code>CombatAnimatorParameterChanged = 6;</code>
     */
    CombatAnimatorParameterChanged(6),
    /**
     * <code>EntityMove = 7;</code>
     */
    EntityMove(7),
    /**
     * <code>SyncEntityPosition = 8;</code>
     */
    SyncEntityPosition(8),
    /**
     * <code>CombatSteerMotionInfo = 9;</code>
     */
    CombatSteerMotionInfo(9),
    /**
     * <code>CombatForceSetPosInfo = 10;</code>
     */
    CombatForceSetPosInfo(10),
    /**
     * <code>CombatCompensatePosDiff = 11;</code>
     */
    CombatCompensatePosDiff(11),
    /**
     * <code>CombatMonsterDoBlink = 12;</code>
     */
    CombatMonsterDoBlink(12),
    /**
     * <code>CombatFixedRushMove = 13;</code>
     */
    CombatFixedRushMove(13),
    /**
     * <code>CombatSyncTransform = 14;</code>
     */
    CombatSyncTransform(14),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>CombatNone = 0;</code>
     */
    public static final int CombatNone_VALUE = 0;
    /**
     * <code>CombatEvtBeingHit = 1;</code>
     */
    public static final int CombatEvtBeingHit_VALUE = 1;
    /**
     * <code>CombatAnimatorStateChanged = 2;</code>
     */
    public static final int CombatAnimatorStateChanged_VALUE = 2;
    /**
     * <code>CombatFaceToDir = 3;</code>
     */
    public static final int CombatFaceToDir_VALUE = 3;
    /**
     * <code>CombatSetAttackTarget = 4;</code>
     */
    public static final int CombatSetAttackTarget_VALUE = 4;
    /**
     * <code>CombatRushMove = 5;</code>
     */
    public static final int CombatRushMove_VALUE = 5;
    /**
     * <code>CombatAnimatorParameterChanged = 6;</code>
     */
    public static final int CombatAnimatorParameterChanged_VALUE = 6;
    /**
     * <code>EntityMove = 7;</code>
     */
    public static final int EntityMove_VALUE = 7;
    /**
     * <code>SyncEntityPosition = 8;</code>
     */
    public static final int SyncEntityPosition_VALUE = 8;
    /**
     * <code>CombatSteerMotionInfo = 9;</code>
     */
    public static final int CombatSteerMotionInfo_VALUE = 9;
    /**
     * <code>CombatForceSetPosInfo = 10;</code>
     */
    public static final int CombatForceSetPosInfo_VALUE = 10;
    /**
     * <code>CombatCompensatePosDiff = 11;</code>
     */
    public static final int CombatCompensatePosDiff_VALUE = 11;
    /**
     * <code>CombatMonsterDoBlink = 12;</code>
     */
    public static final int CombatMonsterDoBlink_VALUE = 12;
    /**
     * <code>CombatFixedRushMove = 13;</code>
     */
    public static final int CombatFixedRushMove_VALUE = 13;
    /**
     * <code>CombatSyncTransform = 14;</code>
     */
    public static final int CombatSyncTransform_VALUE = 14;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CombatTypeArgument valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CombatTypeArgument forNumber(int value) {
      switch (value) {
        case 0: return CombatNone;
        case 1: return CombatEvtBeingHit;
        case 2: return CombatAnimatorStateChanged;
        case 3: return CombatFaceToDir;
        case 4: return CombatSetAttackTarget;
        case 5: return CombatRushMove;
        case 6: return CombatAnimatorParameterChanged;
        case 7: return EntityMove;
        case 8: return SyncEntityPosition;
        case 9: return CombatSteerMotionInfo;
        case 10: return CombatForceSetPosInfo;
        case 11: return CombatCompensatePosDiff;
        case 12: return CombatMonsterDoBlink;
        case 13: return CombatFixedRushMove;
        case 14: return CombatSyncTransform;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CombatTypeArgument>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        CombatTypeArgument> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<CombatTypeArgument>() {
            public CombatTypeArgument findValueByNumber(int number) {
              return CombatTypeArgument.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final CombatTypeArgument[] VALUES = values();

    public static CombatTypeArgument valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CombatTypeArgument(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:CombatTypeArgument)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030CombatTypeArgument.proto*\212\003\n\022CombatTyp" +
      "eArgument\022\016\n\nCombatNone\020\000\022\025\n\021CombatEvtBe" +
      "ingHit\020\001\022\036\n\032CombatAnimatorStateChanged\020\002" +
      "\022\023\n\017CombatFaceToDir\020\003\022\031\n\025CombatSetAttack" +
      "Target\020\004\022\022\n\016CombatRushMove\020\005\022\"\n\036CombatAn" +
      "imatorParameterChanged\020\006\022\016\n\nEntityMove\020\007" +
      "\022\026\n\022SyncEntityPosition\020\010\022\031\n\025CombatSteerM" +
      "otionInfo\020\t\022\031\n\025CombatForceSetPosInfo\020\n\022\033" +
      "\n\027CombatCompensatePosDiff\020\013\022\030\n\024CombatMon" +
      "sterDoBlink\020\014\022\027\n\023CombatFixedRushMove\020\r\022\027" +
      "\n\023CombatSyncTransform\020\016B\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}