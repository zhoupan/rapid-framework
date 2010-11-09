package cn.org.rapid_framework.generator;

public interface GeneratorConstants {

	/** 用于控制存放在生成器中的工具类,以便在模板中使用 StringUtils */
	public String GENERATOR_TOOLS_CLASS = "generator.tools.class";
	
	public String GENERATOR_INCLUDES = "generator.includes";
	public String GENERATOR_EXCLUDES = "generator.excludes";
	
	/** 生成器模板的输入编码,默认UTF-8 */
	public String GENERATOR_SOURCE_ENCODING = "generator.sourceEncoding";
	/** 生成器模板生成的文件编码,默认UTF-8 */
	public String GENERATOR_OUTPUT_ENCODING = "generator.outputEncoding";
	/** 生成器模板自动删除的模板后缀,默认值为: .ftl,.vm */
	public String GENERATOR_REMOVE_EXTENSIONS = "generator.removeExtensions";
	
	/** 用于控制模板默认是否覆盖输出文件,默认值是false */
	public String GG_IS_OVERRIDE = "gg.isOverride";
	
	/** 需要移除的表名前缀,示例值: t_,v_ */
	public String TABLE_REMOVE_PREFIXES = "tableRemovePrefixes";
	
	/** generate by sql中查询结果使用的后缀，默认值为: Result */
	public String GENERATOR_SQL_RESULTCLASS_SUFFIX = "generator.sql.resultClass.suffix";
	
}
