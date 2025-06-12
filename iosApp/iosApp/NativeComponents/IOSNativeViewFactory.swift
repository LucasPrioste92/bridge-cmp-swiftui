//
//  IOSNativeViewFactory.swift
//  iosApp
//
//  Created by Lucas Prioste on 11/06/2025.
//

import SwiftUI
import ComposeApp

class IOSNativeViewFactory: NativeViewFactory {
    static var shared = IOSNativeViewFactory()
    func createTextView(value: CommonFlow<NSString>) -> UIViewController {
        let view = TextView(valueFlow: value)
        return UIHostingController(rootView: view)
    }
}
