import { test, expect, expectTypeOf } from "vitest";
import { IntAdd } from "../main/002-int-add.js";

test("002", () => {
  expect(IntAdd(2, 4)).toBe(6);
  expectTypeOf(IntAdd).returns.toEqualTypeOf<number>();
});
