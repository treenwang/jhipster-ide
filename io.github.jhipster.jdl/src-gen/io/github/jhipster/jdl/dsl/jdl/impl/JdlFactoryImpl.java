/**
 * generated by Xtext 2.10.0
 */
package io.github.jhipster.jdl.dsl.jdl.impl;

import io.github.jhipster.jdl.dsl.jdl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JdlFactoryImpl extends EFactoryImpl implements JdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static JdlFactory init()
  {
    try
    {
      JdlFactory theJdlFactory = (JdlFactory)EPackage.Registry.INSTANCE.getEFactory(JdlPackage.eNS_URI);
      if (theJdlFactory != null)
      {
        return theJdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new JdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case JdlPackage.DOMAIN_MODEL: return createDomainModel();
      case JdlPackage.ELEMENTS: return createElements();
      case JdlPackage.ENTITY: return createEntity();
      case JdlPackage.FIELD: return createField();
      case JdlPackage.ENUM_FIELD: return createEnumField();
      case JdlPackage.STRING_FIELD: return createStringField();
      case JdlPackage.NUMERIC_FIELD: return createNumericField();
      case JdlPackage.INTEGER_FIELD: return createIntegerField();
      case JdlPackage.LONG_FIELD: return createLongField();
      case JdlPackage.BIG_DECIMAL_FIELD: return createBigDecimalField();
      case JdlPackage.FLOAT_FIELD: return createFloatField();
      case JdlPackage.DOUBLE_FIELD: return createDoubleField();
      case JdlPackage.BOOLEAN_FIELD: return createBooleanField();
      case JdlPackage.DATE_FIELD: return createDateField();
      case JdlPackage.LOCAL_DATE_FIELD: return createLocalDateField();
      case JdlPackage.ZONED_DATE_TIME_FIELD: return createZonedDateTimeField();
      case JdlPackage.BINARY_LARGE_OBJECT_FIELD: return createBinaryLargeObjectField();
      case JdlPackage.BLOB_FIELD: return createBlobField();
      case JdlPackage.ANY_BLOB_FIELD: return createAnyBlobField();
      case JdlPackage.IMAGE_BLOB_FIELD: return createImageBlobField();
      case JdlPackage.REQUIRED_VALIDATOR: return createRequiredValidator();
      case JdlPackage.MIN_LENGTH_VALIDATOR: return createMinLengthValidator();
      case JdlPackage.MAX_LENGTH_VALIDATOR: return createMaxLengthValidator();
      case JdlPackage.PATTERN_VALIDATOR: return createPatternValidator();
      case JdlPackage.MIN_VALIDATOR: return createMinValidator();
      case JdlPackage.MAX_VALIDATOR: return createMaxValidator();
      case JdlPackage.MIN_BYTES_VALIDATOR: return createMinBytesValidator();
      case JdlPackage.MAX_BYTES_VALIDATOR: return createMaxBytesValidator();
      case JdlPackage.STRING_VALIDATORS: return createStringValidators();
      case JdlPackage.NUMERIC_VALIDATORS: return createNumericValidators();
      case JdlPackage.BLOB_VALIDATORS: return createBlobValidators();
      case JdlPackage.RELATIONSHIPS: return createRelationships();
      case JdlPackage.RELATIONSHIP: return createRelationship();
      case JdlPackage.RELATIONSHIP_NAME: return createRelationshipName();
      case JdlPackage.ENUM_TYPE: return createEnumType();
      case JdlPackage.GENERATION_SETTING: return createGenerationSetting();
      case JdlPackage.SERVICE_GENERATION_SETTING: return createServiceGenerationSetting();
      case JdlPackage.DTO_GENERATION_SETTING: return createDTOGenerationSetting();
      case JdlPackage.PAGINATE_GENERATION_SETTING: return createPaginateGenerationSetting();
      case JdlPackage.PAGINATE_TYPE: return createPaginateType();
      case JdlPackage.ANGULAR_SUFFIX_GENERATION_SETTING: return createAngularSuffixGenerationSetting();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JdlPackage.CARDINALITY:
        return createCardinalityFromString(eDataType, initialValue);
      case JdlPackage.SERVICE_TYPE:
        return createServiceTypeFromString(eDataType, initialValue);
      case JdlPackage.DTO_TYPE:
        return createDTOTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case JdlPackage.CARDINALITY:
        return convertCardinalityToString(eDataType, instanceValue);
      case JdlPackage.SERVICE_TYPE:
        return convertServiceTypeToString(eDataType, instanceValue);
      case JdlPackage.DTO_TYPE:
        return convertDTOTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DomainModel createDomainModel()
  {
    DomainModelImpl domainModel = new DomainModelImpl();
    return domainModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Elements createElements()
  {
    ElementsImpl elements = new ElementsImpl();
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Field createField()
  {
    FieldImpl field = new FieldImpl();
    return field;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumField createEnumField()
  {
    EnumFieldImpl enumField = new EnumFieldImpl();
    return enumField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringField createStringField()
  {
    StringFieldImpl stringField = new StringFieldImpl();
    return stringField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericField createNumericField()
  {
    NumericFieldImpl numericField = new NumericFieldImpl();
    return numericField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntegerField createIntegerField()
  {
    IntegerFieldImpl integerField = new IntegerFieldImpl();
    return integerField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LongField createLongField()
  {
    LongFieldImpl longField = new LongFieldImpl();
    return longField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimalField createBigDecimalField()
  {
    BigDecimalFieldImpl bigDecimalField = new BigDecimalFieldImpl();
    return bigDecimalField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatField createFloatField()
  {
    FloatFieldImpl floatField = new FloatFieldImpl();
    return floatField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DoubleField createDoubleField()
  {
    DoubleFieldImpl doubleField = new DoubleFieldImpl();
    return doubleField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanField createBooleanField()
  {
    BooleanFieldImpl booleanField = new BooleanFieldImpl();
    return booleanField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DateField createDateField()
  {
    DateFieldImpl dateField = new DateFieldImpl();
    return dateField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalDateField createLocalDateField()
  {
    LocalDateFieldImpl localDateField = new LocalDateFieldImpl();
    return localDateField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ZonedDateTimeField createZonedDateTimeField()
  {
    ZonedDateTimeFieldImpl zonedDateTimeField = new ZonedDateTimeFieldImpl();
    return zonedDateTimeField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BinaryLargeObjectField createBinaryLargeObjectField()
  {
    BinaryLargeObjectFieldImpl binaryLargeObjectField = new BinaryLargeObjectFieldImpl();
    return binaryLargeObjectField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlobField createBlobField()
  {
    BlobFieldImpl blobField = new BlobFieldImpl();
    return blobField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AnyBlobField createAnyBlobField()
  {
    AnyBlobFieldImpl anyBlobField = new AnyBlobFieldImpl();
    return anyBlobField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageBlobField createImageBlobField()
  {
    ImageBlobFieldImpl imageBlobField = new ImageBlobFieldImpl();
    return imageBlobField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequiredValidator createRequiredValidator()
  {
    RequiredValidatorImpl requiredValidator = new RequiredValidatorImpl();
    return requiredValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinLengthValidator createMinLengthValidator()
  {
    MinLengthValidatorImpl minLengthValidator = new MinLengthValidatorImpl();
    return minLengthValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxLengthValidator createMaxLengthValidator()
  {
    MaxLengthValidatorImpl maxLengthValidator = new MaxLengthValidatorImpl();
    return maxLengthValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternValidator createPatternValidator()
  {
    PatternValidatorImpl patternValidator = new PatternValidatorImpl();
    return patternValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinValidator createMinValidator()
  {
    MinValidatorImpl minValidator = new MinValidatorImpl();
    return minValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxValidator createMaxValidator()
  {
    MaxValidatorImpl maxValidator = new MaxValidatorImpl();
    return maxValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinBytesValidator createMinBytesValidator()
  {
    MinBytesValidatorImpl minBytesValidator = new MinBytesValidatorImpl();
    return minBytesValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MaxBytesValidator createMaxBytesValidator()
  {
    MaxBytesValidatorImpl maxBytesValidator = new MaxBytesValidatorImpl();
    return maxBytesValidator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringValidators createStringValidators()
  {
    StringValidatorsImpl stringValidators = new StringValidatorsImpl();
    return stringValidators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumericValidators createNumericValidators()
  {
    NumericValidatorsImpl numericValidators = new NumericValidatorsImpl();
    return numericValidators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlobValidators createBlobValidators()
  {
    BlobValidatorsImpl blobValidators = new BlobValidatorsImpl();
    return blobValidators;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationships createRelationships()
  {
    RelationshipsImpl relationships = new RelationshipsImpl();
    return relationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipName createRelationshipName()
  {
    RelationshipNameImpl relationshipName = new RelationshipNameImpl();
    return relationshipName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumType createEnumType()
  {
    EnumTypeImpl enumType = new EnumTypeImpl();
    return enumType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GenerationSetting createGenerationSetting()
  {
    GenerationSettingImpl generationSetting = new GenerationSettingImpl();
    return generationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceGenerationSetting createServiceGenerationSetting()
  {
    ServiceGenerationSettingImpl serviceGenerationSetting = new ServiceGenerationSettingImpl();
    return serviceGenerationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOGenerationSetting createDTOGenerationSetting()
  {
    DTOGenerationSettingImpl dtoGenerationSetting = new DTOGenerationSettingImpl();
    return dtoGenerationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaginateGenerationSetting createPaginateGenerationSetting()
  {
    PaginateGenerationSettingImpl paginateGenerationSetting = new PaginateGenerationSettingImpl();
    return paginateGenerationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PaginateType createPaginateType()
  {
    PaginateTypeImpl paginateType = new PaginateTypeImpl();
    return paginateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AngularSuffixGenerationSetting createAngularSuffixGenerationSetting()
  {
    AngularSuffixGenerationSettingImpl angularSuffixGenerationSetting = new AngularSuffixGenerationSettingImpl();
    return angularSuffixGenerationSetting;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cardinality createCardinalityFromString(EDataType eDataType, String initialValue)
  {
    Cardinality result = Cardinality.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCardinalityToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceType createServiceTypeFromString(EDataType eDataType, String initialValue)
  {
    ServiceType result = ServiceType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertServiceTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DTOType createDTOTypeFromString(EDataType eDataType, String initialValue)
  {
    DTOType result = DTOType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDTOTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JdlPackage getJdlPackage()
  {
    return (JdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static JdlPackage getPackage()
  {
    return JdlPackage.eINSTANCE;
  }

} //JdlFactoryImpl
