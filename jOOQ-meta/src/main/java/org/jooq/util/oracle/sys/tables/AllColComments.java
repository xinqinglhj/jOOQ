/**
 * This class is generated by jOOQ
 */
package org.jooq.util.oracle.sys.tables;

/**
 * This class is generated by jOOQ.
 *
 * Comments on columns of accessible tables and views
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.6"},
                            comments = "This class is generated by jOOQ")
public class AllColComments extends org.jooq.impl.TableImpl<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord> {

	private static final long serialVersionUID = 708501173;

	/**
	 * The singleton instance of SYS.ALL_COL_COMMENTS
	 */
	public static final org.jooq.util.oracle.sys.tables.AllColComments ALL_COL_COMMENTS = new org.jooq.util.oracle.sys.tables.AllColComments();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord> __RECORD_TYPE = org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * Owner of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord, java.lang.String> OWNER = createField("OWNER", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the object
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord, java.lang.String> TABLE_NAME = createField("TABLE_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Name of the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord, java.lang.String> COLUMN_NAME = createField("COLUMN_NAME", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * Comment on the column
	 */
	public final org.jooq.TableField<org.jooq.util.oracle.sys.tables.records.AllColCommentsRecord, java.lang.String> COMMENTS = createField("COMMENTS", org.jooq.impl.SQLDataType.VARCHAR, this);

	/**
	 * No further instances allowed
	 */
	private AllColComments() {
		super("ALL_COL_COMMENTS", org.jooq.util.oracle.sys.Sys.SYS);
	}

	/**
	 * No further instances allowed
	 */
	private AllColComments(java.lang.String alias) {
		super(alias, org.jooq.util.oracle.sys.Sys.SYS, org.jooq.util.oracle.sys.tables.AllColComments.ALL_COL_COMMENTS);
	}

	@Override
	public org.jooq.util.oracle.sys.tables.AllColComments as(java.lang.String alias) {
		return new org.jooq.util.oracle.sys.tables.AllColComments(alias);
	}
}
