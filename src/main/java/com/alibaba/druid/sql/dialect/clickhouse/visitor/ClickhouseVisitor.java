package com.alibaba.druid.sql.dialect.clickhouse.visitor;

import com.alibaba.druid.sql.ast.statement.SQLWithSubqueryClause;
import com.alibaba.druid.sql.visitor.SQLASTVisitor;

public interface ClickhouseVisitor extends SQLASTVisitor {
    boolean visit(SQLWithSubqueryClause.Entry x);
    void endVisit(SQLWithSubqueryClause.Entry x);
}
