public interface ShoppingCartVisitor {
  Double visit(Chair chair);

  Double visit(Table table);
}
