package jacketjie.astimes.greenDao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import jacketjie.astimes.greenDao.ATInformalEssay;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ATINFORMAL_ESSAY.
*/
public class ATInformalEssayDao extends AbstractDao<ATInformalEssay, Long> {

    public static final String TABLENAME = "ATINFORMAL_ESSAY";

    /**
     * Properties of entity ATInformalEssay.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property ATIEId = new Property(1, String.class, "ATIEId", false, "ATIEID");
        public final static Property ATIEImageUrl = new Property(2, String.class, "ATIEImageUrl", false, "ATIEIMAGE_URL");
        public final static Property ATIETitle = new Property(3, String.class, "ATIETitle", false, "ATIETITLE");
        public final static Property ATIEText = new Property(4, String.class, "ATIEText", false, "ATIETEXT");
        public final static Property ATIEReleaseDate = new Property(5, String.class, "ATIEReleaseDate", false, "ATIERELEASE_DATE");
        public final static Property ATIEHasSubmit = new Property(6, int.class, "ATIEHasSubmit", false, "ATIEHAS_SUBMIT");
        public final static Property ATIEShared = new Property(7, int.class, "ATIEShared", false, "ATIESHARED");
    };


    public ATInformalEssayDao(DaoConfig config) {
        super(config);
    }
    
    public ATInformalEssayDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ATINFORMAL_ESSAY' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'ATIEID' TEXT NOT NULL UNIQUE ," + // 1: ATIEId
                "'ATIEIMAGE_URL' TEXT," + // 2: ATIEImageUrl
                "'ATIETITLE' TEXT," + // 3: ATIETitle
                "'ATIETEXT' TEXT," + // 4: ATIEText
                "'ATIERELEASE_DATE' TEXT," + // 5: ATIEReleaseDate
                "'ATIEHAS_SUBMIT' INTEGER NOT NULL ," + // 6: ATIEHasSubmit
                "'ATIESHARED' INTEGER NOT NULL );"); // 7: ATIEShared
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ATINFORMAL_ESSAY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, ATInformalEssay entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getATIEId());
 
        String ATIEImageUrl = entity.getATIEImageUrl();
        if (ATIEImageUrl != null) {
            stmt.bindString(3, ATIEImageUrl);
        }
 
        String ATIETitle = entity.getATIETitle();
        if (ATIETitle != null) {
            stmt.bindString(4, ATIETitle);
        }
 
        String ATIEText = entity.getATIEText();
        if (ATIEText != null) {
            stmt.bindString(5, ATIEText);
        }
 
        String ATIEReleaseDate = entity.getATIEReleaseDate();
        if (ATIEReleaseDate != null) {
            stmt.bindString(6, ATIEReleaseDate);
        }
        stmt.bindLong(7, entity.getATIEHasSubmit());
        stmt.bindLong(8, entity.getATIEShared());
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public ATInformalEssay readEntity(Cursor cursor, int offset) {
        ATInformalEssay entity = new ATInformalEssay( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // ATIEId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // ATIEImageUrl
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // ATIETitle
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // ATIEText
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // ATIEReleaseDate
            cursor.getInt(offset + 6), // ATIEHasSubmit
            cursor.getInt(offset + 7) // ATIEShared
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, ATInformalEssay entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setATIEId(cursor.getString(offset + 1));
        entity.setATIEImageUrl(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setATIETitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setATIEText(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setATIEReleaseDate(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setATIEHasSubmit(cursor.getInt(offset + 6));
        entity.setATIEShared(cursor.getInt(offset + 7));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(ATInformalEssay entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(ATInformalEssay entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}