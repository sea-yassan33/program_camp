/**
 * test：テストを1件定義する関数
 * expect：実行時の値を検証する関数
 * expectTypeOf：型を検証する関数
 */
import { test, expect, expectTypeOf } from "vitest";
import { hello } from "../main/001-hello.js";

test("hello", () => {
  // 値のテスト
  expect(hello("TS")).toBe("Hello, TS!");
  // 型のテスト
  expectTypeOf(hello).returns.toEqualTypeOf<string>();
});
