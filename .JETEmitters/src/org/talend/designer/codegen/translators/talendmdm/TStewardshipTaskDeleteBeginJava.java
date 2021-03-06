package org.talend.designer.codegen.translators.talendmdm;

import org.talend.core.model.process.INode;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import java.util.List;

public class TStewardshipTaskDeleteBeginJava
{
  protected static String nl;
  public static synchronized TStewardshipTaskDeleteBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TStewardshipTaskDeleteBeginJava result = new TStewardshipTaskDeleteBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "                if(log.is";
  protected final String TEXT_3 = "Enabled())";
  protected final String TEXT_4 = NL + "            log.";
  protected final String TEXT_5 = "(\"";
  protected final String TEXT_6 = " - \" ";
  protected final String TEXT_7 = " + ";
  protected final String TEXT_8 = " ";
  protected final String TEXT_9 = ");";
  protected final String TEXT_10 = NL + "            StringBuilder ";
  protected final String TEXT_11 = " = new StringBuilder();";
  protected final String TEXT_12 = NL + "            ";
  protected final String TEXT_13 = ".append(\"Parameters:\");";
  protected final String TEXT_14 = NL + "                    ";
  protected final String TEXT_15 = ".append(\"";
  protected final String TEXT_16 = "\" + \" = \" + String.valueOf(";
  protected final String TEXT_17 = ").substring(0, 4) + \"...\");     ";
  protected final String TEXT_18 = NL + "                    ";
  protected final String TEXT_19 = ".append(\"";
  protected final String TEXT_20 = "\" + \" = \" + ";
  protected final String TEXT_21 = ");";
  protected final String TEXT_22 = NL + "                ";
  protected final String TEXT_23 = ".append(\" | \");";
  protected final String TEXT_24 = NL + "            StringBuilder ";
  protected final String TEXT_25 = " = new StringBuilder();    ";
  protected final String TEXT_26 = NL + "                    ";
  protected final String TEXT_27 = ".append(";
  protected final String TEXT_28 = ".";
  protected final String TEXT_29 = ");";
  protected final String TEXT_30 = NL + "                    if(";
  protected final String TEXT_31 = ".";
  protected final String TEXT_32 = " == null){";
  protected final String TEXT_33 = NL + "                        ";
  protected final String TEXT_34 = ".append(\"<null>\");" + NL + "                    }else{";
  protected final String TEXT_35 = NL + "                        ";
  protected final String TEXT_36 = ".append(";
  protected final String TEXT_37 = ".";
  protected final String TEXT_38 = ");" + NL + "                    }   ";
  protected final String TEXT_39 = NL + "                ";
  protected final String TEXT_40 = ".append(\"|\");";
  protected final String TEXT_41 = NL + "\tint deleted_task_";
  protected final String TEXT_42 = " = 0;\t" + NL + "        java.net.Authenticator.setDefault(new java.net.Authenticator() {" + NL + "            protected java.net.PasswordAuthentication getPasswordAuthentication() {" + NL + "            ";
  protected final String TEXT_43 = NL + "                ";
  protected final String TEXT_44 = " " + NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_45 = " = routines.system.PasswordEncryptUtil.decryptPassword(";
  protected final String TEXT_46 = ");";
  protected final String TEXT_47 = NL + "\tfinal String decryptedPassword_";
  protected final String TEXT_48 = " = ";
  protected final String TEXT_49 = "; ";
  protected final String TEXT_50 = NL + "                        " + NL + "            \treturn new java.net.PasswordAuthentication(";
  protected final String TEXT_51 = ", decryptedPassword_";
  protected final String TEXT_52 = ".toCharArray());" + NL + "        }});" + NL + "\t\t\t\t" + NL + "\t\t";
  protected final String TEXT_53 = NL + "\t\t" + NL + "\t\tjava.net.URL wsdlUrl_";
  protected final String TEXT_54 = " = new java.net.URL(";
  protected final String TEXT_55 = ");" + NL + "\t\t" + NL + "\t\torg.talend.datastewardship.server.ws.TDSCWS_Service service_";
  protected final String TEXT_56 = " = new org.talend.datastewardship.server.ws.TDSCWS_Service(wsdlUrl_";
  protected final String TEXT_57 = ");" + NL + "\t\torg.talend.datastewardship.server.ws.TDSCWS TDSCWS_";
  protected final String TEXT_58 = " = service_";
  protected final String TEXT_59 = ".getTDSCWSImplPort();" + NL + "\t\t\t\t" + NL + "\t\t";
  protected final String TEXT_60 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_61 = NL + "\t\t\tString startDateString_";
  protected final String TEXT_62 = " = ";
  protected final String TEXT_63 = ";" + NL + "\t\t\tString endDateString_";
  protected final String TEXT_64 = " = ";
  protected final String TEXT_65 = ";" + NL + "\t\t\tjavax.xml.datatype.DatatypeFactory factory_";
  protected final String TEXT_66 = " = javax.xml.datatype.DatatypeFactory.newInstance();" + NL + "\t    \tjavax.xml.datatype.XMLGregorianCalendar startXMLGregorianCalendar_";
  protected final String TEXT_67 = " = null;" + NL + "\t    \tjavax.xml.datatype.XMLGregorianCalendar endXMLGregorianCalendar_";
  protected final String TEXT_68 = " = null;" + NL + "\t    \tif(startDateString_";
  protected final String TEXT_69 = "!=null && !startDateString_";
  protected final String TEXT_70 = ".equals(\"\")){" + NL + "\t    \t\tjava.text.SimpleDateFormat startdf_";
  protected final String TEXT_71 = " = new java.text.SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");" + NL + "\t\t\t\tstartdf_";
  protected final String TEXT_72 = ".parse(startDateString_";
  protected final String TEXT_73 = ");" + NL + "\t\t\t\tjava.util.Calendar startCal_";
  protected final String TEXT_74 = " = startdf_";
  protected final String TEXT_75 = ".getCalendar();" + NL + "\t\t\t\tjava.util.GregorianCalendar startDate_";
  protected final String TEXT_76 = " = (java.util.GregorianCalendar) startCal_";
  protected final String TEXT_77 = ";" + NL + "\t\t\t\tstartXMLGregorianCalendar_";
  protected final String TEXT_78 = " = factory_";
  protected final String TEXT_79 = ".newXMLGregorianCalendar(startDate_";
  protected final String TEXT_80 = ");" + NL + "\t\t\t}" + NL + "\t    \tif(endDateString_";
  protected final String TEXT_81 = "!=null && !endDateString_";
  protected final String TEXT_82 = ".equals(\"\")){" + NL + "\t        \tjava.text.SimpleDateFormat enddf_";
  protected final String TEXT_83 = " = new java.text.SimpleDateFormat(\"yyyy-MM-dd HH:mm:ss\");" + NL + "\t            enddf_";
  protected final String TEXT_84 = ".parse(endDateString_";
  protected final String TEXT_85 = ");" + NL + "\t            java.util.Calendar endCal_";
  protected final String TEXT_86 = " = enddf_";
  protected final String TEXT_87 = ".getCalendar();" + NL + "\t            java.util.GregorianCalendar endDate_";
  protected final String TEXT_88 = " = (java.util.GregorianCalendar) endCal_";
  protected final String TEXT_89 = ";" + NL + "\t\t\t\tendXMLGregorianCalendar_";
  protected final String TEXT_90 = " = factory_";
  protected final String TEXT_91 = ".newXMLGregorianCalendar(endDate_";
  protected final String TEXT_92 = ");" + NL + "\t\t\t}" + NL + "\t\t\t\t\t\t" + NL + "\t\t\tdeleted_task_";
  protected final String TEXT_93 = " = TDSCWS_";
  protected final String TEXT_94 = ".deleteTasks(";
  protected final String TEXT_95 = ",";
  protected final String TEXT_96 = ",";
  protected final String TEXT_97 = ",startXMLGregorianCalendar_";
  protected final String TEXT_98 = ",endXMLGregorianCalendar_";
  protected final String TEXT_99 = ",";
  protected final String TEXT_100 = ",";
  protected final String TEXT_101 = ",";
  protected final String TEXT_102 = ");" + NL + "\t\t\t";
  protected final String TEXT_103 = NL + "\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
class BasicLogUtil{
    protected String cid  = "";
    protected org.talend.core.model.process.INode node = null;
    protected boolean log4jEnabled = false;
    private String logID = "";
    
    private BasicLogUtil(){}
    
    public BasicLogUtil(org.talend.core.model.process.INode node){
        this.node = node;
        String cidx = this.node.getUniqueName();
        if(cidx.matches("^.*?tAmazonAuroraOutput_\\d+_out$")){
             cidx = cidx.substring(0,cidx.length()-4);// 4 ==> "_out".length();
        }
        this.cid = cidx;
        this.log4jEnabled = ("true").equals(org.talend.core.model.process.ElementParameterParser.getValue(this.node.getProcess(), "__LOG4J_ACTIVATE__"));
        this.log4jEnabled = this.log4jEnabled &&
                            this.node.getComponent().isLog4JEnabled() && !"JOBLET".equals(node.getComponent().getComponentType().toString());
        this.logID = this.cid;
    }
    
    public String var(String varName){
        return varName + "_" + this.cid;
    }
    public String str(String content){
        return "\"" + content + "\"";
    }
    
    public void info(String... message){
        log4j("info", message);
    }
    
    public void debug(String... message){
        log4j("debug", message);
    }
    
    public void warn(String... message){
        log4j("warn", message);
    }
    
    public void error(String... message){
        log4j("error", message);
    }
    
    public void fatal(String... message){
        log4j("fatal", message);
    }
    
    public void trace(String... message){
        log4j("trace", message);
    }
    java.util.List<String> checkableList = java.util.Arrays.asList(new String[]{"info", "debug", "trace"});     
    public void log4j(String level, String... messages){
        if(this.log4jEnabled){
            if(checkableList.contains(level)){
            
    stringBuffer.append(TEXT_2);
    stringBuffer.append(level.substring(0, 1).toUpperCase() + level.substring(1));
    stringBuffer.append(TEXT_3);
    
            }
            
    stringBuffer.append(TEXT_4);
    stringBuffer.append(level);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(logID);
    stringBuffer.append(TEXT_6);
    for(String message : messages){
    stringBuffer.append(TEXT_7);
    stringBuffer.append(message);
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    
        }
    }
    
    public boolean isActive(){
        return this.log4jEnabled;
    }
}

class LogUtil extends BasicLogUtil{
    
    private LogUtil(){
    }
    
    public LogUtil(org.talend.core.model.process.INode node){
        super(node);
    }
    
    public void startWork(){
        info(str("Start to work."));
    }
    
    public void endWork(){
        info(str("Done."));
    }
    
    public void logIgnoredException(String exception){
        warn(exception);
    }
    
    public void logPrintedException(String exception){
        error(exception);
    }
    
    public void logException(String exception){
        fatal(exception);
    }
    
    public void logCompSetting(){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_10);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(TEXT_12);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_13);
    
            java.util.Set<org.talend.core.model.process.EParameterFieldType> ignoredParamsTypes = new java.util.HashSet<org.talend.core.model.process.EParameterFieldType>(); 
            ignoredParamsTypes.addAll(
                java.util.Arrays.asList(
                    org.talend.core.model.process.EParameterFieldType.SCHEMA_TYPE,
                    org.talend.core.model.process.EParameterFieldType.LABEL,
                    org.talend.core.model.process.EParameterFieldType.EXTERNAL,
                    org.talend.core.model.process.EParameterFieldType.MAPPING_TYPE,
                    org.talend.core.model.process.EParameterFieldType.IMAGE,
                    org.talend.core.model.process.EParameterFieldType.TNS_EDITOR,
                    org.talend.core.model.process.EParameterFieldType.WSDL2JAVA,
                    org.talend.core.model.process.EParameterFieldType.GENERATEGRAMMARCONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.GENERATE_SURVIVORSHIP_RULES_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.REFRESH_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.BROWSE_REPORTS,
                    org.talend.core.model.process.EParameterFieldType.PALO_DIM_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.GUESS_SCHEMA,
                    org.talend.core.model.process.EParameterFieldType.MATCH_RULE_IMEX_CONTROLLER,
                    org.talend.core.model.process.EParameterFieldType.MEMO_PERL,
                    org.talend.core.model.process.EParameterFieldType.DBTYPE_LIST,
                    org.talend.core.model.process.EParameterFieldType.VERSION,
                    org.talend.core.model.process.EParameterFieldType.TECHNICAL,
                    org.talend.core.model.process.EParameterFieldType.ICON_SELECTION,
                    org.talend.core.model.process.EParameterFieldType.JAVA_COMMAND,
                    org.talend.core.model.process.EParameterFieldType.TREE_TABLE,
                    org.talend.core.model.process.EParameterFieldType.VALIDATION_RULE_TYPE,
                    org.talend.core.model.process.EParameterFieldType.DCSCHEMA,
                    org.talend.core.model.process.EParameterFieldType.SURVIVOR_RELATION,
                    org.talend.core.model.process.EParameterFieldType.REST_RESPONSE_SCHEMA_TYPE
                    )
            );
            for(org.talend.core.model.process.IElementParameter ep : org.talend.core.model.utils.NodeUtil.getDisplayedParameters(node)){
                if(!ep.isLog4JEnabled() || ignoredParamsTypes.contains(ep.getFieldType())){
                    continue;
                }
                String name = ep.getName();
                if(org.talend.core.model.process.EParameterFieldType.PASSWORD.equals(ep.getFieldType())){
                    String epName = "__" + name + "__";
                    String password = "";
                    if(org.talend.core.model.process.ElementParameterParser.canEncrypt(node, epName)){
                        password = org.talend.core.model.process.ElementParameterParser.getEncryptedValue(node, epName);
                    }else{
                        String passwordValue = org.talend.core.model.process.ElementParameterParser.getValue(node, epName);
                        if (passwordValue == null || "".equals(passwordValue.trim())) {// for the value which empty
                            passwordValue = "\"\"";
                        } 
                        password = "routines.system.PasswordEncryptUtil.encryptPassword(" + passwordValue + ")";
                    } 
                    
    stringBuffer.append(TEXT_14);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_16);
    stringBuffer.append(password);
    stringBuffer.append(TEXT_17);
    
                }else{
                    String value = org.talend.core.model.utils.NodeUtil.getNormalizeParameterValue(node, ep);
                    
    stringBuffer.append(TEXT_18);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_20);
    stringBuffer.append(value);
    stringBuffer.append(TEXT_21);
    
                }   
                
    stringBuffer.append(TEXT_22);
    stringBuffer.append(var("log4jParamters"));
    stringBuffer.append(TEXT_23);
    
            }
        }
        debug(var("log4jParamters"));
    }
    
    //no use for now, because we log the data by rowStruct
    public void traceData(String rowStruct, java.util.List<org.talend.core.model.metadata.IMetadataColumn> columnList, String nbline){
        if(log4jEnabled){
        
    stringBuffer.append(TEXT_24);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_25);
    
            for(org.talend.core.model.metadata.IMetadataColumn column : columnList){
                org.talend.core.model.metadata.types.JavaType javaType = org.talend.core.model.metadata.types.JavaTypesManager.getJavaTypeFromId(column.getTalendType());
                String columnName = column.getLabel();
                boolean isPrimit = org.talend.core.model.metadata.types.JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable());
                if(isPrimit){
                
    stringBuffer.append(TEXT_26);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_28);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_29);
    
                }else{
                
    stringBuffer.append(TEXT_30);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_31);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_32);
    stringBuffer.append(TEXT_33);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_34);
    stringBuffer.append(TEXT_35);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(rowStruct);
    stringBuffer.append(TEXT_37);
    stringBuffer.append(columnName);
    stringBuffer.append(TEXT_38);
    
                }
                
    stringBuffer.append(TEXT_39);
    stringBuffer.append(var("log4jSb"));
    stringBuffer.append(TEXT_40);
    
            }
        }
        trace(str("Content of the record "), nbline, str(": "), var("log4jSb"));
        
    
    }
}

class LogHelper{
    
    java.util.Map<String, String> pastDict = null;
    
    public LogHelper(){
        pastDict = new java.util.HashMap<String, String>();
        pastDict.put("insert", "inserted");
        pastDict.put("update", "updated");
        pastDict.put("delete", "deleted");
        pastDict.put("upsert", "upserted");
    }   
    
    public String upperFirstChar(String data){ 
        return data.substring(0, 1).toUpperCase() + data.substring(1);
    }
    
    public String toPastTense(String data){
        return pastDict.get(data);
    }
}
LogHelper logHelper = new LogHelper();

LogUtil log = null;

     
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
    INode node = (INode)codeGenArgument.getArgument();
    LogUtil logUtil = new LogUtil(node);
    String cid = node.getUniqueName();	

	String url = ElementParameterParser.getValue(node, "__URL__");
	String taskType = ElementParameterParser.getValue(node, "__TASKTYPE__");
	String owner = ElementParameterParser.getValue(node,"__OWNER__");
	String tag = ElementParameterParser.getValue(node, "__TAG__");
	String startDate = ElementParameterParser.getValue(node, "__START_DATETIME__");
	String endDate = ElementParameterParser.getValue(node, "__END_DATETIME__");
	String starRanking = ElementParameterParser.getValue(node, "__STAR_RANKING__");
	String limit = ElementParameterParser.getValue(node,"__LIMIT__");
	String status = ElementParameterParser.getValue(node,"__STATUS__");
	String username = ElementParameterParser.getValue(node, "__USERNAME__");
	String password = ElementParameterParser.getValue(node, "__PASSWORD__");
	boolean targetRecordOnly = ("true").equals(ElementParameterParser.getValue(node,"__TARGET_RECORD_ONLY__"));
	boolean isDeleteById = ("true").equals(ElementParameterParser.getValue(node, "__DELETE_BY_ID__"));
	boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));

    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_42);
    
                String passwordFieldName = "__PASSWORD__";
                
    stringBuffer.append(TEXT_43);
    if (ElementParameterParser.canEncrypt(node, passwordFieldName)) {
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_45);
    stringBuffer.append(ElementParameterParser.getEncryptedValue(node, passwordFieldName));
    stringBuffer.append(TEXT_46);
    } else {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_48);
    stringBuffer.append( ElementParameterParser.getValue(node, passwordFieldName));
    stringBuffer.append(TEXT_49);
    }
    stringBuffer.append(TEXT_50);
    stringBuffer.append(username);
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_52);
     logUtil.debug("\"Initializing DSC web service from URL: \"", url,"\".\"");
    stringBuffer.append(TEXT_53);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_54);
    stringBuffer.append(url );
    stringBuffer.append(TEXT_55);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_58);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_59);
     logUtil.debug("\"Start deleting tasks.\"");
    stringBuffer.append(TEXT_60);
    
		if(!isDeleteById){
		
    stringBuffer.append(TEXT_61);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(startDate.equals("")?null:startDate);
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_64);
    stringBuffer.append(endDate.equals("")?null:endDate);
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_66);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_67);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_68);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_72);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_73);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_74);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_76);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_81);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_83);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_85);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_86);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_88);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_89);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_93);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_94);
    stringBuffer.append(taskType);
    stringBuffer.append(TEXT_95);
    stringBuffer.append(owner.equals("")?null:owner);
    stringBuffer.append(TEXT_96);
    stringBuffer.append(tag.equals("")?null:tag);
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_98);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(starRanking);
    stringBuffer.append(TEXT_100);
    stringBuffer.append(limit);
    stringBuffer.append(TEXT_101);
    stringBuffer.append(status.equals("null")?null:"\""+status+"\"");
    stringBuffer.append(TEXT_102);
     logUtil.debug("\"Tasks deleted successfully .\"");
    stringBuffer.append(TEXT_103);
    
		}
		
    return stringBuffer.toString();
  }
}
